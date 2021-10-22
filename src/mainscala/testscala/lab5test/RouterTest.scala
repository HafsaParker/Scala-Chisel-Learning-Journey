package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class RouterTest extends FreeSpec with ChiselScalatestTester{
    "Router Test" in {
        test(new Router(UInt(2.W))){c=>
        c.io.inn.afeild.poke(1.U)
        c.io.inn.dfeild.poke(1.U)
        c.clock.step(20)
        c.io.out.afeild.expect(1.U)
        c.io.out.dfeild.expect(1.U)


        }
    }
}