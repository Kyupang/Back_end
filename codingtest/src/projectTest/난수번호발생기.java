package projectTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class 난수번호발생기 {
    public static void main(String[] args) {
        Random ran = new Random();
        int minBound = 10000000;  // 8자리 수의 최소값
        int maxBound = 100000000;  // 8자리 수의 최대값
        Set<Integer> generatedNumbers = new HashSet<>();

        while (generatedNumbers.size() < 45977) {
            int randomNumber = ran.nextInt(maxBound - minBound + 1) + minBound;
            generatedNumbers.add(randomNumber);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("numbers2.txt"))) {
            for (int number : generatedNumbers) {
                writer.write("('02" + number + "'),");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        System.out.println("Values have been written to numbers.txt file.");
        System.out.println("Total count: " + generatedNumbers.size());
    }
}
