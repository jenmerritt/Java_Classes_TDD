import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    private Printer printer2;
    private Printer printer3;

    @Before
    public void before(){
        printer = new Printer(10, 50);
        printer2 = new Printer(0, 10);
        printer3 = new Printer(10, 0);

    }

    @Test
    public void can_get_number_of_sheets(){
        assertEquals(10, printer.getNumberOfSheets().intValue());
    }

    @Test
    public void print_reduces_number_of_sheets(){
        printer.print(1,2);
        assertEquals(8, printer.getNumberOfSheets().intValue());
    }

    @Test
    public void print_does_not_run_if_sheets_is_0(){
        printer2.print(1,2);
        assertEquals(0, printer2.getNumberOfSheets().intValue());
    }

    @Test
    public void can_get_volume_of_toner(){
        assertEquals(50, printer.getTonerVolume().intValue());
    }

    @Test
    public void print_reduces_toner_volume(){
        printer.print(1,2);
        assertEquals(48, printer.getTonerVolume().intValue());
    }

    @Test
    public void print_does_not_run_if_toner_volume_is_0(){
        printer3.print(1,2);
        assertEquals(0, printer3.getTonerVolume().intValue());
    }
}
