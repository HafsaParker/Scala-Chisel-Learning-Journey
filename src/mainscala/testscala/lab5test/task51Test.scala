package lab5task
import org.scalatest._
import chiseltest._
import chisel3._
class task51Test extends FreeSpec with ChiselScalatestTester{
    "task51 Test" in {
        test(new ALU(32)){c=>
        c.io.arg_x.poke(5.U)
        c.io.arg_y.poke(5.U)
        c.io.alu_oper.poke("b0000".U)
        c.clock.step(20)
        c.io.alu_out.expect(5.U)
        


        }
    }
}