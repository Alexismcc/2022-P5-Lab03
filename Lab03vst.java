//temp
public class Lab03vst
{
    public static void main(String[] args)
    {
        System.out.println("Lab03, 100 point Version\n");

        int startingValue = 10000;
        int hours = startingValue / 3600;
        int seconds = startingValue % 3600;
        int minutes = seconds / 60;
        int remainder = seconds % 60;

        System.out.println(" Starting Seconds:   " + startingValue + 123);
        System.out.println(" Hours:              " + hours);
        System.out.println(" Minutes:            " + minutes);
        System.out.println(" Seconds:            " + remainder );
        System.out.println(" Milli Seconds:      " + 123 );
    }
}
