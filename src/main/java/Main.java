import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        //int[] data=new int[12];
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService stats = new StatsService();
        System.out.println("Сумма продаж = " + stats.sum(sales));
        System.out.println("Средняя сумма продаж = " + stats.avg(sales));
        System.out.println("Месяц с максимумом продаж = " + stats.max(sales));
        System.out.println("Месяц с минимумом продаж = " + stats.min(sales));
        System.out.println("Кол-во месяцев с продажами ниже среднего = " + stats.countBelowAvg(sales));
        System.out.println("Кол-во месяцев с продажами выше среднего = " + stats.countUnderAvg(sales));

    }

}

