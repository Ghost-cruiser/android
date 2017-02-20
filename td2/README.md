Analyse du projet (par Florian Marie et Ludovic Robez) :

  Code :
    
    MainActivity.java = 
    
    public void onClick(View view) {
      EditText txtLogin = (EditText) findViewById(R.id.editText);
      if (txtLogin.getText().toString().isEmpty()) {
        txtLogin.setError("Veuillez rentrer un user");
        return;
      }
      Intent intentPicker = new Intent(MainActivity.this, PickerActivity.class);
      startActivity(intentPicker);
    }

    ==> Pas de réutilisation du login ; cette vérification n'est donc pas pertinente
    
    
    ***********************************************************************
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      [...]
    }

    ==> La navigation devrait se trouver dans un fragment dédié
    
    
    
    ***********************************************************************
    
    GalleryAndroidActivity.java = 
    
    
    public class ImageAdapter extends BaseAdapter {
      [...]
    }
    
    ==> Cette classe devrait être séparée de l'activité pour une meilleure réutilisabilité.
    
    
    ***********************************************************************
    
    
 Fonctionnelle :
 
    
    GalleryAndroidActivity.java = 
    ==> Le toast n'apporte aucune information
    
    
    ***********************************************************************
    
 
    PickerActivity.java = 
    ==> Cette classe n'est pas réellement utilisée, le résultat du choix n'est enregistré ou réutilisé nulle part
