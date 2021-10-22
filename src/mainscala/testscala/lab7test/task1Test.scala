package lab7task
import org.scalatest._
import chiseltest._
import chisel3._
class task1Test extends FreeSpec with ChiselScalatestTester{
    "task1 Test" in {
        test(new Queue()){c=>
        c.io.in(0).poke(1.U)
        c.io.in(1).poke(0.U)
        c.io.in(2).poke(0.U)
        c.io.in(3).poke(0.U)
        c.clock.step(5)

        }
    }
}
