package execution

object Referee {
  def playGame(one: Team, two: Team): Unit = {
    if ((one.offense - two.defense) >= 0) {
      one.score = one.offense - two.defense
    }
    if ((one.offense - two.defense) < 0) {
      one.score = 0
    }
    if ((two.offense - one.defense) >= 0) {
      two.score = two.offense - one.defense
    }
    if ((two.offense - one.defense) < 0) {
      two.score = 0
    }

  }
  def declareWinner(one: Team, two: Team): Team = {
    if (one.score > two.score) {
      one
    }
    else if (one.score < two.score) {
      two
    }
    else {
      new Team(0,0)
    }
  }
}
