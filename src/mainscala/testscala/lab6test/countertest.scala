package lab6task
import org.scalatest._
import chiseltest._
import chisel3._
class countertest extends FreeSpec with ChiselScalatestTester{
    "counter test" in{
        test(new counter(32)){c=>
        c.clock.step(5)

        }
    }

}