package com.spotify.demo.health;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

  @GetMapping("/{service}")
  public Map<String, Health> service(@PathVariable String service) {
    return Map.of("main", new Health(true, true, 0), "staging", new Health(true, true, 2));
  }

}
