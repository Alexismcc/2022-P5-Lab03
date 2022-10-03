//temp
public class Lab03vst
{
    public static void main(String[] args)
    {
        System.out.println("Lab03, 100 point Version\n");

        int startingValue = 10000123;
        System.out.println(" Starting Seconds:   " + startingValue );

        int hours = startingValue / 3600000;
        startingValue %= 3600000;

        int minutes = startingValue / 60000;
        startingValue %= 60000;

        int seconds = startingValue / 1000;
        startingValue %= 1000;




        System.out.println(" Hours:              " + hours);
        System.out.println(" Minutes:            " + minutes);
        System.out.println(" Seconds:            " + seconds );
        System.out.println(" Milli Seconds:      " + startingValue );
    }
}
