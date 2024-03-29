package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLessons__13;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainClass {
    public static final int CARS_COUNT = 4;


    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT);
        CountDownLatch cd = new CountDownLatch(CARS_COUNT);
        Semaphore semaphore = new Semaphore(CARS_COUNT / 2);
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(semaphore), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cd);
        }

        Thread[] threads = new Thread[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            threads[i] = new Thread(cars[i]);
            threads[i].start();
        }
        try {
            cd.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Итоги заезда:");
        System.out.printf("1 место занял %s. Он получает золотую медаль.", Car.getPlaceMap().get(1));
        System.out.printf("\n2 место занял %s. Он получает серебрянную медаль.", Car.getPlaceMap().get(2));
        System.out.printf("\n3 место занял %s. Он получает бронзовую медаль.", Car.getPlaceMap().get(3));
        System.out.printf("\n4 место занял %s. Он получает железную медаль.", Car.getPlaceMap().get(4));
    }
}

