package Database;

public class Player {

	private String meno;
	private int score;

	public Player(String meno, int score) {
		this.meno = meno;
		this.score = score;
	}

	public Player(String meno) {
		this.meno = meno;
	}

	public String getMeno() {
		return meno;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Player [meno=" + meno + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meno == null) ? 0 : meno.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (meno == null) {
			if (other.meno != null)
				return false;
		} else if (!meno.equals(other.meno))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
}
