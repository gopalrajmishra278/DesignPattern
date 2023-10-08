package com.gopal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		YoutubeChannel channel = new YoutubeChannel();

		Subsriber amit = new Subsriber("Amit");
		Subsriber sandeep = new Subsriber("Sandeep");

		channel.subscribe(amit);
		channel.subscribe(sandeep);
		channel.unSubscribe(amit);
		channel.unSubscribe(sandeep);

		channel.newVideoUploaded("Learn Design Pattern");

		channel.newVideoUploaded("Learn SpringBoot");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("Press 1 to upload new video");
			System.out.println("Press 2 to create new Subscriber");
			System.out.println("Press 3 to exit ");
			System.out.println("Press 4 to UnSubscribe ");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {

				// new video upload code
				System.out.println("Enter video title: ");

				String videoTitle = br.readLine();

				channel.newVideoUploaded(videoTitle);

			} else if (c == 2) {

				// create new subscriber
				System.out.println("Enter the name of the subscriber: ");

				String subsName = br.readLine();
				Subsriber subscriber3 = new Subsriber(subsName);
				channel.subscribe(subscriber3);

			} else if (c == 3) {

				// exit
				System.out.println("Thankyou for using app: ");
				break;

			}else if (c == 4) {

				// exit
				System.out.println("Successfully unsubscribe");
				

			}
			
			
			else {
                // exit wrong input
				System.out.println("Wrong input");
			}
		}

	}

}
