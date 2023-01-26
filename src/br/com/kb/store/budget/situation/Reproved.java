package br.com.kb.store.budget.situation;

import br.com.kb.store.budget.Budget;

public class Reproved extends Situation {

    @Override
    public void done(Budget budget) {
        budget.setSituation(new Done());
    }

}
