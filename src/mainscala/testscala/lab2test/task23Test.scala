package lab2task
import org.scalatest._
import chiseltest._
import chisel3._
class task23Test extends FreeSpec with ChiselScalatestTester{
    "task23 Test" in {
        test(new encoder()){ c=>
        c.io.input.poke("b0001".U)
        c.io.out.expect(0.U)
        c.clock.step(20)


        }
    }

}