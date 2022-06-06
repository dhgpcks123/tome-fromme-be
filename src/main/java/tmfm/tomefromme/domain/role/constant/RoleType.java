package tmfm.tomefromme.domain.role.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleType {
    ROLE_USER("ROLE_USER", "사용자"),
    ROLE_MANAGER("ROLE_MANAGER", "매니저"),
    ROLE_ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
