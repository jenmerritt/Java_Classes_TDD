import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void check_volume_starts_at_100(){
        assertEquals(100, bottle.getVolume().intValue());
    }

    @Test
    public void reduce_volume_by_10_after_drink(){
        bottle.drunkFrom();
        assertEquals(90, bottle.getVolume().intValue());
    }

    @Test
    public void do_not_reduce_volume_lower_than_0(){
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        bottle.drunkFrom();
        assertEquals(0, bottle.getVolume().intValue());
    }

    @Test
    public void can_empty_bottle_to_0(){
        bottle.emptied();
        assertEquals(0, bottle.getVolume().intValue());
    }

    @Test
    public void can_fill_bottle_to_100(){
        bottle.filled();
        assertEquals(100, bottle.getVolume().intValue());
    }

}
