package hu.palacsint.purejavacomm.purejavacomm_jna4;

import java.util.Enumeration;

import purejavacomm.CommPortIdentifier;

public final class Main {

	public static void main(final String[] args) {
		final Enumeration<CommPortIdentifier> portIdentifiers = purejavacomm.CommPortIdentifier.getPortIdentifiers();
		while (portIdentifiers.hasMoreElements()) {
			final CommPortIdentifier commPortIdentifier = portIdentifiers.nextElement();
			System.out.println(commPortIdentifier.getName());
		}
		System.out.println("end");
	}
}
