package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class muxinputpriorityTest extends FreeSpec with ChiselScalatestTester{
    "mux input priority Test" in {
        test(new Mux_tree()){ c=>
        c.io.in.poke("b0100".U)
        
        c.clock.step(20)
        c.io.out.expect(false.B)

        }
    }
}