package org.toyrobot.math;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.toyrobot.math.Point2D.point2d;

public class Point2DTest {
    @Test
    public void addVectorToPoint() {
        assertEquals(point2d(6, 8), point2d(5, 8).add(point2d(1,0)));
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Point2D.class).verify();
    }

    @Test
    public void builderConstructsPoint2D() {
        var point2D = point2d(10, 4);
        assertEquals(10, point2D.getX());
        assertEquals(4, point2D.getY());
    }

    @Test
    public void toStringTest() {
        assertEquals("Point2D(x=10, y=4)", point2d(10, 4).toString());
    }
}