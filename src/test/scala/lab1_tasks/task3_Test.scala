package lab1_tasks
import org.scalatest._
import chiseltest._
import chisel3._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
class task3_Test extends FreeSpec with ChiselScalatestTester{
    "task3 test" in {
    test(new task3(3,3)){ c =>
      c.clock.step(30)
    }
    }
}
