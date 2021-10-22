package lab6task
import org.scalatest._
import chiseltest._
import chisel3._
class ex2Test extends FreeSpec with ChiselScalatestTester{
    "ex2 Test" in {
        test(new counterr(6)){c=>
        c.clock.step(103)

        }
    }

}