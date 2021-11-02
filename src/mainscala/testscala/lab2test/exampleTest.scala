package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class exampleTest extends FreeSpec with ChiselScalatestTester{
    "example Test" in {
        test(new example()){ c =>
        c.io.x.poke(4.U)
        c.io.y.poke(2.U)
        c.clock.step(1)
        c.io.out.expect(6.U)


        }
    }
} 