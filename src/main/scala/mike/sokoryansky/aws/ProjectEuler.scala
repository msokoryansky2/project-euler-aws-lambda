package mike.sokoryansky.aws

import java.io.{BufferedReader, InputStreamReader}
import java.util.stream.Collectors

import mike.sokoryansky.EulerProblems.EulerProblem

class ProjectEuler {
  import java.io.{InputStream, OutputStream}

  def solve(input: InputStream, output: OutputStream): Unit = {
    val problemNumber: Int = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining("")).toInt
    val answer: String = EulerProblem(problemNumber) match {
      case Some(p) => p.run
      case _ => "N/A"
    }
    output.write(answer.getBytes("UTF-8"))
  }
}
