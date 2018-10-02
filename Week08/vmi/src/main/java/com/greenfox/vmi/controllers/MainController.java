package com.greenfox.vmi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;


@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubled doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new Doubled("Please provide an input!");
        }
        return new Doubled(input, input * 2);
    }

    static class Doubled {
        public int recived;
        public int result;

        public String error;

        public Doubled(int recived, int result) {
            this.recived = recived;
            this.result = result;
        }

        public Doubled(String error) {
            this.error = error;
        }
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Welcome greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null) {
            return new Welcome("Please provide a name!");
        }

        if (title == null) {
            return new Welcome("Please provide a title!");
        }
        return new Welcome(name, title);
    }

    static class Welcome {
        public String welcome_message;
        public String error;

        public Welcome(String name, String title) {
            this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }

        public Welcome(String error) {
            this.error = error;
        }
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public AppendA append(@PathVariable(required = false) String appendable) {
        return new AppendA(appendable);
    }

    static class AppendA {
        public String appended;

        public AppendA(String appendable) {
            this.appended = appendable + "a";
        }
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Output dountil(@PathVariable(required = false) String action, @RequestBody(required = false) Input until) {
        if (until == null) {
            return new Output("Please provide a number!");
        } else if (action.equals("sum")) {
            int a = 0;
            for (int i = 0; i <= until.until; i++) {
                a = a + i;
            }
            return new Output(a);
        } else if (action.equals("factor")) {
            int b = 1;
            for (int i = 1; i <= until.until; i++) {
                b = b * i;
            }
            return new Output(b);
        } else {
            return new Output("Ohoh, somethong went wrong.");
        }
    }


    static class Input {
        public int until;

    }

    static class Output {
        public int result;
        public String error;

        public Output(int result) {
            this.result = result;
        }

        public Output(String error) {
            this.error = error;
        }
    }

    @PostMapping("/arrays")
    @ResponseBody
    public IntOutput array(@RequestBody(required = false) ArrayInput array) {
        if (array.what == null || array.numbers == null || array == null) {
            return new IntOutput("Please provide what to do with the numbers!");
        } else if (array.what.equals("sum")) {
            int[] a = new int[1];
            for (int i = 0; i < array.numbers.length; i++) {
                a[0] = a[0] + array.numbers[i];
            }
            return new IntOutput(a);
        } else if (array.what.equals("multiply")) {
            int[] b = new int[1];
            b[0] = 1;
            for (int i = 0; i < array.numbers.length; i++) {
                b[0] = b[0] * array.numbers[i];
            }
            return new IntOutput(b);
        } else if (array.what.equals("double")) {
            for (int i = 0; i < array.numbers.length; i++) {
                array.numbers[i] = array.numbers[i] * 2;
            }
            return new IntOutput(array.numbers);

        }
        return new IntOutput("Ohoh, something went wrong.");
    }

    static class ArrayInput {
        public String what;
        public int[] numbers;

    }


    static class IntOutput {
        public int[] result;
        public String error;

        public IntOutput(int[] result) {
            this.result = result;
        }

        public IntOutput(String error) {
            this.error = error;
        }
    }

    @PostMapping("/sith")
    @ResponseBody
    public OutputSith shit(@RequestBody(required = false) InputText text) {
        if (text == null) {
            return new OutputSith(null, "Feed me some text you have to, padawan young you are. Hmmm.");
        } else {
            String sentences[] = text.text.split("[.]");
            String c = "";
            String b = "";
            String d = "";
            String e = "";
            for (int i = 0; i < sentences.length; i++) {
                String[] words = sentences[i].trim().split(" ");
                if (words.length % 2 == 0) {
                    for (int j = 0; j < words.length; j += 2) {
                        String a = words[j] + " ";
                        words[j] = words[j + 1] + " ";
                        words[j + 1] = a;
                    }
                    b = String.join("", words) + ".";
                    e = b.toLowerCase();
                    d = e.substring(0, 1).toUpperCase() + e.substring(1);
                    b = d + " Arrgh. Uhmm. ";
                } else if (words.length % 2 != 0) {
                    for (int j = 0; j < words.length - 1; j += 2) {
                        String a = words[j] + " ";
                        words[j] = words[j + 1] + " ";
                        words[j + 1] = a;
                    }
                    b = String.join("", words) + ".";
                    e = b.toLowerCase();
                    d = e.substring(0, 1).toUpperCase() + e.substring(1);
                    byte[] array = new byte[7]; // length is bounded by 7
                    new Random().nextBytes(array);
                    String f = new String(array, Charset.forName("UTF-8"));
                    b = d + " Err..err.err. ";


                }

                c = c + b;
            }

            return new OutputSith(c, null);
        }
    }

    static class InputText {
        public String text;
    }

    static class OutputSith {
        public String sith_text;
        public String error;

        public OutputSith(String sith_text, String error) {
            this.sith_text = sith_text;
            this.error = error;
        }
    }


}
