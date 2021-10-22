package lab3task
import org.scalatest._
import chiseltest._
import chisel3._
class task31Test extends FreeSpec with ChiselScalatestTester{
    "task31 Test" in {
        test(new encoder4to2()){c=>
        c.io.in.poke("b1000".U)
        c.clock.step(20)
        c.io.out.expect("b00".U)

        }
    }
}