console.log("jQueryLeague");
$(document).ready(function() {
    $('#selectLeague').change(function() {
        var selectedLeagueId = $(this).val();

        $.ajax({
            url: '/getLeagueInfo', // URL du contrôleur Spring
            type: 'GET',
            data: { leagueId: selectedLeagueId },
            success: function(response) {
                // Mettez à jour l'interface utilisateur avec les informations de la ligue
                var leagueInfo = JSON.parse(response);
                $('#leagueName').text(leagueInfo.name);
                $('#leagueDescription').text(leagueInfo.description);
            },
            error: function() {
                console.log('Une erreur s\'est produite lors du chargement des informations de la ligue.');
            }
        });
    });
});