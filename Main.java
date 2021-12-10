import java.util.*;
    public class Main {
        public static void main(String[] args) {
            List<String> words = Arrays.asList(
                    "Я", "Узнал", "Что", "У", "Меня", "Есть","Огромная", "Семья","И",
                    "Тропинка", "И", "Лесок", "В", "Поле","Каждый","Колосок","Речка","Небо","Голубое","Это","Всё","МоЁ","Родное","Это", "Родина","Моя","Всех","Люблю", "На","Свете","Я",
                    "Я", "Узнал", "Что", "У", "Меня", "Есть","Огромная", "Семья","И",
                    "Тропинка", "И", "Лесок", "В", "Поле","Каждый","Колосок","Речка","Небо","Голубое","Это","Всё","МоЁ","Родное","Это", "Родина","Моя","Всех","Люблю", "На","Свете","Я"

            );
            Set<String> unique = new HashSet<String>(words);
            System.out.println("Первонасальный массив");
            System.out.println(words.toString());
            System.out.println("Уникальные слова");
            System.out.println("Частота встречаемости слов");
            for(String key : unique){
                System.out.println(key + ": " + Collections.frequency(words, key));
            }
        }
    }


