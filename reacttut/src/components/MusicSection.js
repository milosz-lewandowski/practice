import React from "react";

export class MusicSection extends React.Component{
    render() {
        return(
            <div>
                <iframe width="100%" height="120" scrolling="no" frameBorder="no" allow="autoplay"
                        src="https://w.soundcloud.com/player/?url=https%3A//api.soundcloud.com/tracks/1015536727&color=%23ff5500&
                    auto_play=false&hide_related=false&show_comments=true&show_user=true&show_reposts=false&show_teaser=true">
                </iframe>
                <iframe width="100%" height="120" scrolling="no" frameBorder="no" allow="autoplay"
                    src="https://w.soundcloud.com/player/?url=https%3A//api.soundcloud.com/tracks/327563345&color=%23ff5500&
                    auto_play=false&hide_related=false&show_comments=true&show_user=true&show_reposts=false&show_teaser=true">
                </iframe>
            </div>
        )
    }
}

