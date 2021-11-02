package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class example10Test extends FreeSpec with ChiselScalatestTester{
    "example10 Test" in {
        test(new one_muxhot()){c=>
            c.io.in0.poke(true.B)
            c.io.in1.poke(false.B)
            c.io.in2.poke(false.B)
            c.io.in3.poke(false.B)
            c.io.sel.poke("b0100".U)
            c.clock.step(20)
            c.io.out.expect(true.B)
        }
        
        
    }
}