import java.util.List;

public class SimpleNumberProcessor implements Runnable  {
    private List<Integer> subList;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public SimpleNumberProcessor(List<Integer> subList, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.subList = subList;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() {
        for (int number : subList) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            } else {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
        }
    }

}
