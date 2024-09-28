import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numberList.add(i);
        }

        ArrayList<Integer> subList1 = new ArrayList<>(numberList.subList(0, 2500));
        ArrayList<Integer> subList2 = new ArrayList<>(numberList.subList(2500, 5000));
        ArrayList<Integer> subList3 = new ArrayList<>(numberList.subList(5000, 7500));
        ArrayList<Integer> subList4 = new ArrayList<>(numberList.subList(7500, 10000));

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        Thread thread1 = new Thread(new SimpleNumberProcessor(subList1, evenNumbers, oddNumbers));
        Thread thread2 = new Thread(new SimpleNumberProcessor(subList2, evenNumbers, oddNumbers));
        Thread thread3 = new Thread(new SimpleNumberProcessor(subList3, evenNumbers, oddNumbers));
        Thread thread4 = new Thread(new SimpleNumberProcessor(subList4, evenNumbers, oddNumbers));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Çift Sayılar: " + evenNumbers);
        System.out.println("Tek Sayılar: " + oddNumbers);
    }
    }
