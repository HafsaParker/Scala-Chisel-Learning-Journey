package lab3task
import org.scalatest._
import chiseltest._
import chisel3._
class as3Test extends FreeSpec with ChiselScalatestTester{
    "as3 Test" in {
        test(new decoder_with_valid){c=>
        c.io.in.poke("b00".U)
        c.clock.step(20)
        c.io.out.valid.expect(1.B)
        c.io.out.bits.expect("b0001".U)


        }
    }
}