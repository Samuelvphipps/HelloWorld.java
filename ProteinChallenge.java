// So a strand of DNA could look something like ACGAATTCCG.

// Write a DNA.java program that determines whether there is a protein in a strand of DNA.

// A protein has the following qualities:

// It begins with a “start codon”: ATG.
// It ends with a “stop codon”: TGA.
// In between, each additional codon is a sequence of three nucleotides.
// So for example:

// ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
// ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.


//Checks if string is a valid dna sequence
public class ProteinChallenge {
//test comment push
    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;
        //check length
        System.out.println(dna.length());
        //check for first start codon
        System.out.println(dna.indexOf("ATG"));
        //check for stop codon
        System.out.println(dna.indexOf("TGA"));
        //check for start and endcodon
        if (dna.indexOf("ATG") != -1
                && dna.indexOf("TGA") != -1
                && (dna.indexOf("TGA") - dna.indexOf("ATG")) % 3 == 0
        ) {
            System.out.println("Protien!");
        } else {
            System.out.println("Not a valid protien :(");
        }

    }

}