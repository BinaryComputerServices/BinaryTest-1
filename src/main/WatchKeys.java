package main;

import java.nio.file.Path;

public class WatchKeys {
	
	public void register(){
	if (true) {
		Path prev = null;
		Path dir = null;
		if (prev == null) {
			System.out.format("register: %s\n", dir);
			System.out.println(prev.toString());
		} else {
			if (!dir.equals(prev)) {
				System.out.format("update: %s -> %s\n", prev, dir);
			}
		}
	}
	}
}
