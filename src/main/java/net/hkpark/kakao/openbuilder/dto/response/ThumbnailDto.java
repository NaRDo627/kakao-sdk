package net.hkpark.kakao.openbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ThumbnailDto {
    /**
     * 이미지의 url입니다. (필수)
     */
    @JsonProperty("imageUrl")
    private final String imageUrl;

    /**
     * 이미지 클릭시 작동하는 link입니다.
     */
    @JsonProperty("link")
    private final LinkDto link;

    /**
     * true: 이미지 영역을 1:1 비율로 두고 이미지의 원본 비율을 유지합니다. 이미지가 없는 영역은 흰색으로 노출합니다.
     * false: 이미지 영역을 2:1 비율로 두고 이미지의 가운데를 크롭하여 노출합니다.
     */
    @Builder.Default
    @JsonProperty("fixedRatio")
    private final boolean fixedRatio = false;

    /**
     * fixedRatio를 true로 설정할 경우 필요한 값입니다.
     * 실제 이미지 사이즈와 다른 값일 경우 원본이미지와 다르게 표현될 수 있습니다.
     */
    @JsonProperty("width")
    private final int width;

    /**
     * fixedRatio를 true로 설정할 경우 필요한 값입니다.
     * 실제 이미지 사이즈와 다른 값일 경우 원본이미지와 다르게 표현될 수 있습니다.
     */
    @JsonProperty("height")
    private final int height;
}
