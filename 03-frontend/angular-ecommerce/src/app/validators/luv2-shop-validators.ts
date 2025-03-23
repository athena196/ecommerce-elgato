import { FormControl, ValidationErrors } from "@angular/forms";

export class Luv2ShopValidators {

    // whitespace validation. Called in checkout.component.ts
    static notOnlyWhiteSpace(control: FormControl): ValidationErrors {

        // check of string only contains whitespace
        if ((control.value != null) && (control.value.trim().length === 0)) {

            // invalid, return error object
            return { 'notOnlyWhitespace': true };
        }
        else {

            return null;
        }
    }
}

/*

Whitespace validators only for firstName & lastName, no need for email as REGEX already tackle the issue.

*/
