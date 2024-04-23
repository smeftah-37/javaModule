import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

    public class Program {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            Frequency freq = new Frequency();

            Map<Character, Integer> charCounts = new LinkedHashMap<>();
            line.chars().forEach(c -> charCounts.merge((char) c, 1, Integer::sum));

            // Sort the map by value (count) and then by key (character)
            Map<Character, Integer> sortedCharCounts = charCounts.entrySet().stream()
                    .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            // Calculate maximum count for scaling
            int maxCount = sortedCharCounts.values().stream().mapToInt(Integer::intValue).max().orElse(0);

            // Draw the histogram chart
            int maxHeight = 10;
            sortedCharCounts.forEach((character, count) -> {
                int scaledHeight = (int) Math.ceil((double) count / maxCount * maxHeight);
                String histogramBar = String.format("%c: %d %s", character, count, "=".repeat(scaledHeight));
                System.out.println(histogramBar);
            });


        }
    }