package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseballsTest {

	@Test
	public void Baseball객체_생성() {
		Baseballs myBaseballs = Baseballs.createBaseballs("123");
		assertThat(myBaseballs).isInstanceOf(Baseballs.class);
	}

	@Test
	public void randomBaseball_객체_생성() {
		Baseballs comBaseballs = Baseballs.createRandomBaseballs();
		assertThat(comBaseballs).isInstanceOf(Baseballs.class);
	}

	@Test
	public void 숫자_길이_체크_예외처리() {
		assertThatThrownBy(() -> {
			Baseballs.createBaseballs("1234");
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void 숫자_중복_체크_예외처리() {
		assertThatThrownBy(() -> {
			Baseballs.createBaseballs("122");
		}).isInstanceOf(IllegalArgumentException.class);
	}
}