package com.spotify.demo.health;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

  private volatile boolean alerting = true;

  @GetMapping("/{service}")
  public Map<String, Health> service(@PathVariable String service) {
    return Map.of("prod", new Health(alerting, true, 0), "preProd", new Health(alerting, true, 2));
  }

  @PostMapping("/toggle")
  public void toggle() {
    alerting = !alerting;
  }
}
