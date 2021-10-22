package lab6task
import org.scalatest._
import chiseltest._
import chisel3._
class ex1Test extends FreeSpec with ChiselScalatestTester{
    "ex1 Test" in {
        test(new ex1()){c=>
        c.io.in.poke(4.U)
        c.io.reload.poke(1.B)
        c.clock.step(20)

        }
    }
}