package firstStage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringTest {

    @DisplayName("요구사항 1 : ',' 구분자로 split 배열반환 확인")
    @Test
    void split() {
        String str = "1,2";
        String regex = ",";

        String[] arrStr = str.split(regex);

        assertThat(arrStr).containsExactly("1", "2");
    }

    @DisplayName("요구사항 2 : substring으로 '1,2'문자열만 반환")
    @Test
    void substring() {
        String str = "(1,2)";

        String subStr = str.substring(1, 4);

        assertThat(subStr).isEqualTo("1,2");
    }

    @DisplayName("요구사항 3 : charAt() 메서드로 위치의 문자 가져오기")
    @Test
    void charAt() {
        String str = "abc";

        assertThat(str.charAt(0)).isEqualTo('a');
        assertThat(str.charAt(1)).isEqualTo('b');
        assertThat(str.charAt(2)).isEqualTo('c');
    }

    @DisplayName("요구사항 3 : chatAt()로 특정 위치 문자를 가져올 때 위치를 벗어나면 예외 발생")
    @Test
    void chatAtException() {
        String str = "abc";

        assertThatThrownBy(() -> {
            assertThat(str.charAt(5)).isEqualTo('c');
        }).isInstanceOf(IndexOutOfBoundsException.class)
        .hasMessageContaining("range: 5");
    }
}
