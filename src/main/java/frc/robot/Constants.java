// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public class LEDsConstants {
        public static final int LED_PWM_PORT = 0;
        public static final int LED_BUFFER_TIME = 12;
        
        public enum LED_STATES{
            DISABLED(-1),
            MIXER(1),
            HAS_POSE(2), 
            COLLECTED(3), 
            SHOT(4), 
            FINISHED_CLIMB(5), 
            SHOOTING(6), 
            CHASING(7), 
            READYING_SHOOT(8), 
            CLIMBED(9), 
            CAN_SHOOT(10), 
            HAS_PIECE(11), 
            HAS_VISION(12),
            OFF(13);

            private final int priority;
            LED_STATES(int priority) {
                this.priority = priority;
            }

            public int getPriority() {
                return priority;
            }
        }
    }
}
