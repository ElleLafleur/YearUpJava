//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class trynum3 {
//
//    public static void printLongestWord() throws IOException {
//        String check = "BCDEFGHIJKLMbcdefjhijklm";
//        File file = new File("/Users/Rabiii/Downloads/dictionary.txt");
//        Scanner input = new Scanner(file);
//        String longestWord = "";
//        while (input.hasNextLine()) {
//            String line = input.nextLine();
//            if (line.length() >= longestWord.length() && check.contains(String.valueOf(line.charAt(0)))) {
//                longestWord = line;
//            }
//        }
//        System.out.println("The longest word from 'b' to 'm' is: " + longestWord);
//        input.close();
//    }
//    public static void countVowelsBtoM() throws FileNotFoundException {
//        String check = "BCDEFGHIJKLMbcdefjhijklm";
//        File file = new File("C:\\Users\\Lafle\\IdeaProjects\\BOA_Week8_HW\\src\\dictionary.txt");
//        Scanner input = new Scanner(file);
//        int vowelCount = 0;
//        while (input.hasNextLine()) {
//            String line = input.nextLine();
//            if (check.contains(String.valueOf(line.charAt(0)))) {
//                for (int i = 0; i < line.length(); i++) {
//                    if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u' || line.charAt(i) == 'y'
//                            || line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U') {
//                        vowelCount++;
//                    }
//                }
//            }
//        }
//        System.out.println("Total number of vowels in words that start with a letter from 'b' to 'm': " + vowelCount);
//    }
//    public static Map<Character, List<String>> groupByFirstChar(String fileName)
//            throws IOException {
//
//        Paths.get("C:\\\\Users\\\\amanu\\\\Downloads\\\\dictionary.txt");
//        flatMap(s -> Stream.of(s.split("[^a-zA-Z]"))).
//                filter(s -> s.length() > 0).
//                map(s -> s.toLowerCase()).
//                collect(Collectors.groupingBy(s -> s.charAt(0)));
//    }
//}
