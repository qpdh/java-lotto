package lotto;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoManagerTest extends NsTest {
    // 사용자 입력 테스트
    @DisplayName("입력 금액이 1,000원 단위로 떨어지지 않으면 예외가 발생한다.")
    @Test
    void 입력_금액_1000원_단위_테스트() {
        assertThatThrownBy(() -> new LottoManager().insertMoney("1001")).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력 금액이 정수가 아니면 예외가 발생한다.")
    @Test
    void 입력_금액_정수_테스트() {
        assertThatThrownBy(() -> new LottoManager().insertMoney("abcd")).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력 금액이 자연수가 아니면 예외가 발생한다.")
    @Test
    void 입력_금액_자연수_테스트() {
        assertThatThrownBy(() -> new LottoManager().insertMoney("-1000")).isInstanceOf(IllegalArgumentException.class);
    }


    @Override
    protected void runMain() {

    }
}
