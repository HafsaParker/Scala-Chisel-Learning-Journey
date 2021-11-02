package lab7task
import org.scalatest._
import chiseltest._
import chisel3._
class ex1Test extends FreeSpec with ChiselScalatestTester{
    "ex1 Test" in {
        test(new ex1()){c=>
        c.io.in.valid.poke(1.B)
        c.io.in.bits.poke(1.U)
        c.io.consumer.ready.poke(1.B)
        
        c.clock.step(20)
        c.io.consumer.bits.expect(1.U)
        c.io.consumer.valid.expect(1.B)

        }
    }
}