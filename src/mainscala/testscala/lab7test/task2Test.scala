package lab7task
import org.scalatest._
import chiseltest._
import chisel3._
class task2Test extends FreeSpec with ChiselScalatestTester{
    "task2 Test" in {
        test(new Manchester_Encoding()){c=>
        c.io.in.poke(0.U)
        c.io.start.poke(1.B)
        c.clock.step(1)

        c.io.in.poke(0.U)
        c.io.start.poke(1.B)
        c.clock.step(1)

        // c.io.in.poke(1.U)
        // c.io.start.poke(0.B)
        // c.clock.step(1)

        }
    }

}