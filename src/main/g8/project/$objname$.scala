import com.github.ghik.sbt.nosbt.ProjectGroup
import sbt.Keys._
import sbt._

object $objname$ extends ProjectGroup("$name$") {
  override def commonSettings: Seq[Def.Setting[_]] = Seq(
    scalaVersion := "$scala$",
  )

  lazy val root: Project = mkRootProject
}
