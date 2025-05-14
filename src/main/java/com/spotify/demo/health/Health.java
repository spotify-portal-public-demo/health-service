package com.spotify.demo.health;

public record Health(boolean alertingEnabled, boolean sloDefined, int numSecurityIssues) {
}
