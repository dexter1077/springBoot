package kr.co.springboot.user.domain;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/*
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
*/
// @Date = @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode
@Data
public class UserVO implements UserDetails {

    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String userAuth;
    private String appendDate;
    private String updateDate;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.singletonList(new SimpleGrantedAuthority(this.userAuth));
  }

  @Override
  public String getPassword() {
    return this.userPw;
  }

  @Override
  public String getUsername() {
    return this.userId;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
