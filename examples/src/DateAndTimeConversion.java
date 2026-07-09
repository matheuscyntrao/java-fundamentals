import java.util.Date;

public class DateAndTimeConversion {

    static void main() {

        System.out.printf("%s", java.time.LocalDate.now());
        System.out.printf("%s", java.time.LocalDateTime.now());
        System.out.printf("%s", java.time.ZonedDateTime.now());

        java.time.LocalDateTime dataHora = java.time.LocalDateTime.now();
        System.out.printf("%1$td/%1$tm/%1$tY\n", dataHora);
        System.out.printf("%tF\n", dataHora);
        System.out.printf("%tD\n", dataHora);
        System.out.printf("%tT\n", dataHora);
        System.out.printf("%tr\n", dataHora);
        System.out.printf("%tR\n", dataHora);
        System.out.printf("%tY\n", dataHora);
        System.out.printf("%ty\n", dataHora);
        System.out.printf("%tC\n", dataHora);
        System.out.printf("%tB\n", dataHora);
        System.out.printf("%tb\n", dataHora);
        System.out.printf("%th\n", dataHora);
        System.out.printf("%tm\n", dataHora);
        System.out.printf("%td\n", dataHora);
        System.out.printf("%te\n", dataHora);
        System.out.printf("%tA\n", dataHora);
        System.out.printf("%ta\n", dataHora);
        System.out.printf("%tj\n", dataHora);
        System.out.printf("%tH\n", dataHora);
        System.out.printf("%tk\n", dataHora);
        System.out.printf("%tI\n", dataHora);
        System.out.printf("%tl\n", dataHora);
        System.out.printf("%tM\n", dataHora);
        System.out.printf("%tS\n", dataHora);
        System.out.printf("%tL\n", dataHora);
        System.out.printf("%tN\n", dataHora);
        System.out.printf("%tp\n", dataHora);

        java.time.format.DateTimeFormatter formatador = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.printf("%s", dataHora.format(formatador));

        // Format Specifier: % argument index $ flag - width t . precision - conversion character -> conversion character

    }

}
