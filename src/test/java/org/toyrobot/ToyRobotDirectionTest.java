package org.toyrobot;

import org.junit.Test;
import org.toyrobot.math.Direction;
import org.toyrobot.test.BaseToyRobotTest;

import static org.junit.Assert.*;

public class ToyRobotDirectionTest extends BaseToyRobotTest {
    @Test
    public void shouldPlaceToyRobotToFaceNorth() {
        toyRobot.execute("place 3,3,NORTH");
        assertEquals(Direction.NORTH, toyRobot.getDirection());
    }

    @Test
    public void shouldPlaceToyRobotToFaceSouth() {
        toyRobot.execute("place 3,3,SOUTH");
        assertEquals(Direction.SOUTH, toyRobot.getDirection());
    }

    @Test
    public void shouldPlaceToyRobotToFaceEast() {
        toyRobot.execute("place 3,3,EAST");
        assertEquals(Direction.EAST, toyRobot.getDirection());
    }

    @Test
    public void shouldPlaceToyRobotToFaceWest() {
        toyRobot.execute("place 3,3,WEST");
        assertEquals(Direction.WEST, toyRobot.getDirection());
    }

    @Test
    public void shouldIgnoreCommandForWrongDirection() {
        assertRobotCommandIgnored("place 3,3,UNKNOWN");
    }
}